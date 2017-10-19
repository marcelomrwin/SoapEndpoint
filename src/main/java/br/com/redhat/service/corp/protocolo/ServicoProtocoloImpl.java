package br.com.redhat.service.corp.protocolo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(name = "WSGerarProtocolo", serviceName = "WSGerarProtocolo", endpointInterface = "br.com.anbima.service.corp.protocolo.ServicoProtocolo", targetNamespace = "http://service.anbima.com.br/corp/protocolo")
public class ServicoProtocoloImpl implements ServicoProtocolo {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Protocolo gerarProtocolo(String tipoProtocolo, String origemProtocolo) {
	logger.debug("Invoke gerarProtocolo [" + tipoProtocolo + "|" + origemProtocolo + "]");
	return random(origemProtocolo, tipoProtocolo);
    }

    @Override
    public List<Protocolo> gerarListaProtocolos(String tipoProtocolo, String origemProtocolo, int quantidade) {
	logger.debug("Invoke gerarListaProtocolos [" + tipoProtocolo + "|" + origemProtocolo + "|" + quantidade + "]");
	return random(origemProtocolo, tipoProtocolo, quantidade);
    }

    protected Protocolo random(String siglaOrigem, String tipo) {
	Protocolo dto = commonProperties();
	dto.setOrigem(siglaOrigem);
	dto.setTipo(tipo);
	return dto;
    }

    protected Protocolo random() {
	Protocolo dto = commonProperties();
	dto.setOrigem("ORIG");
	dto.setTipo("TIP");

	return dto;
    }

    private static Protocolo commonProperties() {
	Protocolo dto = new Protocolo();
	Date now = new Date();

	dto.setAno(new Random().nextInt(2017 + 1 - 2000) + 2000);
	dto.setCodigo(new Random().nextInt(100 + 1 - 1) + 1);
	dto.setDataCriacao(now);
	dto.setOid(UUID.randomUUID().toString());
	return dto;
    }

    protected List<Protocolo> random(int qtd) {
	List<Protocolo> prots = new LinkedList<>();
	if (qtd > 0) {
	    for (int i = 0; i < qtd; i++)
		prots.add(random());
	}
	return prots;
    }

    protected List<Protocolo> random(String siglaOrigem, String tipo, int qtd) {
	List<Protocolo> prots = new LinkedList<>();
	if (qtd > 0) {
	    for (int i = 0; i < qtd; i++)
		prots.add(random(siglaOrigem, tipo));
	}
	return prots;
    }

}
