/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.printxmascard.nihongo;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author zigui
 *
 */
public class Webservice {

    public String endpoint = "http://localhost:8080/api/";

    public JapaneseWord teste(int nivel, int user) {
        JapaneseWord japaneseWord = new JapaneseWord();
        Client client = ClientBuilder.newBuilder().build();
        Response response = null;

        try {
            WebTarget target = client.target(endpoint + nivel + "/" + user);
            response = target.request().get();
            switch (response.getStatus()) {
                case 200:
                    String value = response.readEntity(String.class);
                    Gson gson = new Gson();
                    japaneseWord = gson.fromJson(value, JapaneseWord.class);
                    break;
                default:
                    System.out.println(response);
                    break;
            }
            client.close();
            response.close();  // You should close connections!
        } catch (JsonSyntaxException e) {
            System.out.println("erro " + e.getMessage());
            client.close();
            response.close();  // You should close connections!
        }
        System.out.println("------------");
        System.out.println(japaneseWord.getWord());
        return japaneseWord;
    }

//    public EnqueteEstatisticaGet getEstaticaEnquete(String number) {
//        EnqueteEstatisticaGet enquete = new EnqueteEstatisticaGet();
//        Client client = ClientBuilder.newBuilder().build();
//        Response response = null;
//        if (number == null) {
//            Mensagem.valorNulo();
//        } else {
//            WebTarget target = client.target(endpoint.concat(number).concat("/stats"));
//            response = target.request().get();
//
//            switch (response.getStatus()) {
//                case 200:
//                    String value = response.readEntity(String.class);
//                    Gson gson = new Gson();
//                    enquete = gson.fromJson(value, EnqueteEstatisticaGet.class);
//                    break;
//                default:
//                    errorGet(response);
//                    break;
//            }
//        }
//        client.close();
//        response.close();  // You should close connections!
//        return enquete;
//    }
//    public void postVote(EnqueteVotePost e) {
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target(endpoint.concat(
//                String.valueOf(e.getPoll_id())).concat("/vote"));
//        Gson gson = new Gson();
//        String jsonInString = gson.toJson(e);
//        Response response = target.request().post(Entity.json(jsonInString));
//        switch (response.getStatus()) {
//            case 200:
//                Mensagem.votoComputado();
//                break;
//            default:
//                errorPost(response);
//                break;
//        }
//        client.close();
//        response.close();  // You should close connections!
//        //pode depois retornar a estatística
//    }
//
//    public EnqueteGet postEnquete(EnquetePost e) {
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target(endpoint);
//        Gson gson = new Gson();
//        String jsonInString = gson.toJson(e);
//        Response response = target.request().post(Entity.json(jsonInString));
//        EnqueteGet enquete = new EnqueteGet();
//        switch (response.getStatus()) {
//            case 200:
//                String value = response.readEntity(String.class);
//                EnqueteGet en = gson.fromJson(value, EnqueteGet.class);
//                enquete = getEnquete(String.valueOf(en.getPoll_id()));
//                Mensagem.enqueteCriada(enquete);
//                break;
//            default:
//                errorPost(response);
//                break;
//        }
//        client.close();
//        response.close();  // You should close connections!
//        return enquete;
//    }
//    public void errorGet(Response response) {
//        switch (response.getStatus()) {
//            case 400:
//                Mensagem.parametroErradoBuscaEnquete();
//                break;
//            case 404:
//                Mensagem.semEnquete();
//                break;
//            case 500:
//                Mensagem.erroNoServidor();
//                break;
//            case 502:
//                Mensagem.erroComunicacaoComOServidor();
//                break;
//            case 503:
//                Mensagem.servicoTemporareamenteForaDoAr();
//                break;
//            default:
//                Mensagem.erroDesconhecido(response);
//                break;
//        }
//    }
//
//    public void errorPost(Response response) {
//        switch (response.getStatus()) {
//            case 400:
//                Mensagem.dadosInvalidos();
//                break;
//            case 404:
//                Mensagem.semEnquete();
//                break;
//            case 405:
//                Mensagem.dadosInvalidos();
//                break;
//            case 500:
//                Mensagem.erroNoServidor();
//                break;
//            case 502:
//                Mensagem.erroComunicacaoComOServidor();
//                break;
//            case 503:
//                Mensagem.servicoTemporareamenteForaDoAr();
//                break;
//            default:
//                Mensagem.erroDesconhecido(response);
//                break;
//        }
//    }
}
