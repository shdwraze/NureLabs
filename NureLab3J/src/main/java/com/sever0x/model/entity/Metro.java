//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.01 at 01:08:39 PM EET 
//


package com.sever0x.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "station"
})
@XmlRootElement(name = "metro")
public class Metro {

    @XmlElement(required = true)
    protected List<Station> station;

    public List<Station> getStation() {
        if (station == null) {
            station = new ArrayList<Station>();
        }
        return this.station;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Station {
        public Station() {
        }
        public Station(String name, String line, String city, NextStation nextStation, PrevStation prevStation, TransferTo transferTo, int id, String someAttribute) {
            this.name = name;
            this.line = line;
            this.city = city;
            this.nextStation = nextStation;
            this.prevStation = prevStation;
            this.transferTo = transferTo;
            this.id = id;
            this.someAttribute = someAttribute;
        }

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String line;
        @XmlElement(required = true)
        protected String city;
        protected NextStation nextStation;
        protected PrevStation prevStation;
        protected TransferTo transferTo;
        @XmlAttribute(name = "id", required = true)
        protected int id;
        @XmlAttribute(name = "someAttribute")
        protected String someAttribute;


        public String getName() {
            return name;
        }


        public void setName(String value) {
            this.name = value;
        }


        public String getLine() {
            return line;
        }


        public void setLine(String value) {
            this.line = value;
        }


        public String getCity() {
            return city;
        }


        public void setCity(String value) {
            this.city = value;
        }


        public NextStation getNextStation() {
            return nextStation;
        }


        public void setNextStation(NextStation value) {
            this.nextStation = value;
        }


        public PrevStation getPrevStation() {
            return prevStation;
        }


        public void setPrevStation(PrevStation value) {
            this.prevStation = value;
        }


        public TransferTo getTransferTo() {
            return transferTo;
        }


        public void setTransferTo(TransferTo value) {
            this.transferTo = value;
        }


        public int getId() {
            return id;
        }


        public void setId(int value) {
            this.id = value;
        }


        public String getSomeAttribute() {
            return someAttribute;
        }


        public void setSomeAttribute(String value) {
            this.someAttribute = value;
        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name"
        })
        public static class NextStation {

            protected String name;


            public String getName() {
                return name;
            }


            public void setName(String value) {
                this.name = value;
            }

            @Override
            public String toString() {
                return "NextStation{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name"
        })
        public static class PrevStation {

            protected String name;


            public String getName() {
                return name;
            }


            public void setName(String value) {
                this.name = value;
            }

            @Override
            public String toString() {
                return "PrevStation{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name"
        })
        public static class TransferTo {

            protected String name;


            public String getName() {
                return name;
            }


            public void setName(String value) {
                this.name = value;
            }

            @Override
            public String toString() {
                return "TransferTo{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Station{" +
                    "name='" + name + '\'' +
                    ", line='" + line + '\'' +
                    ", city='" + city + '\'' +
                    ", nextStation=" + nextStation +
                    ", prevStation=" + prevStation +
                    ", transferTo=" + transferTo +
                    ", id=" + id +
                    ", someAttribute='" + someAttribute + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Metro{" +
                "station=" + station +
                '}';
    }
}
