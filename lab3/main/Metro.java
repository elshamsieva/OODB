package ru.icmit.oodb.dz.lab3.main;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "metro")
public class Metro {

    private String name;

    private List<Client> clients;

    private List<Info> infos;

    private List<TravelCard> travelCards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "clients")
    @XmlElement(name = "client")
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @XmlElementWrapper(name = "infos")
    @XmlElement(name = "info")
    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    @XmlElementWrapper(name = "travelCards")
    @XmlElement(name = "travelCard")
    public List<TravelCard> getTravelCards() {
        return travelCards;
    }

    public void setTravelCards(List<TravelCard> travelCards) {
        this.travelCards = travelCards;
    }

    @Override
    public String toString() {
        return "Metro : " +
                "name='" + name + '\n' +
                ", clients=" + clients + '\n' +
                ", information=" + infos + '\n' +
                ", travelCards=" + travelCards;
    }
}