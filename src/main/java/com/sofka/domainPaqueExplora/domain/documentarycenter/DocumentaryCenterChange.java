package com.sofka.domainPaqueExplora.domain.documentarycenter;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.Project;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.PurchaseInvoice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.entity.TicketOffice;
import com.sofka.domainPaqueExplora.domain.documentarycenter.event.*;

import java.util.HashSet;

public class DocumentaryCenterChange extends EventChange {


    public DocumentaryCenterChange(DocumentaryCenter documentaryCenter) {
        apply((DocumentaryCenterCreate event)->{
            documentaryCenter.name=event.getName();
            documentaryCenter.projectset= new HashSet<>();
            documentaryCenter.ticketOffices= new HashSet<>();
            documentaryCenter.purchases=new HashSet<>();
        });

        apply((ProjectAdded envet)->{
            var numerProject = documentaryCenter.projectset.size();
            if(numerProject ==4){
                throw new IllegalArgumentException("no se puede Archivar mas de 4 proyecto ");
            }
            documentaryCenter.projectset.add(new Project(envet.EntityID(),
                    envet.getName(),
                    envet.ProjectDescription(),
                    envet.CapitalMoney(),
                    envet.DateInitial(),
                    envet.DateFinal()));
        });
        apply((PurcheseInvoiceAdded envet)->{
            var numerProject = documentaryCenter.purchases.size();
            if(numerProject ==10){
                throw new IllegalArgumentException("no se puede Archivar mas de 10 facturas de compra ");
            }
            documentaryCenter.purchases.add(new PurchaseInvoice(envet.EntityId(),
                    envet.DatePurchase(),
                    envet.CompanyName(),
                    envet.PurchaseMoney(),
                    envet.PurchaseDescription()));
        });

        apply((TicketOfficeAdded envet)->{
            var numerProject = documentaryCenter.ticketOffices.size();
            if(numerProject ==1){
                throw new IllegalArgumentException("no se puede Archivar mas de 1 proyecto ");
            }
            documentaryCenter.ticketOffices.add(new TicketOffice(envet.EntityId(),
                    envet.NumberOfBallots(),
                    envet.DateDay(),
                    envet.TicketMoney(),
                    envet.TicketDescription()));
        });

    apply((Projectupdated event)->{
            var project = documentaryCenter.getProjecFortId(event.ProjectId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encontro el documento con el proyecto ingresado"));
            project.upgradeSpecifications(event.ProjectDescription());
            project.upgradeCapitalMoney(event.CapitalMoney());
            project.upgradeDateInitial(event.DateInitial());
            project.upgradeDateFinal(event.DateFinal());
        });

        apply((PurcheseInvoiceupdated event)->{
          var purchaseInovoice=  documentaryCenter.getPurchaseForId(event.PurchaseInvoiceId())
                  .orElseThrow(()-> new IllegalArgumentException("No se encontro la factura ingresada"));
              purchaseInovoice.upgradeData(event.DatePurchase(),event.CompanyName(), event.getPurchaseMoney(),event.PurchaseDescription());
        });

        apply((TicketOfficeupdated event)->{
          var ticketOffice =  documentaryCenter.getTicketOfficeForId(event.Entity())
                  .orElseThrow(()-> new IllegalArgumentException("No se encontro el documento con el proyecto ingresado"));
            ticketOffice.upgradeData(event.NumberOfBallots(),event.DateDay(),event.TicketMoney(),event.TicketDescription());

        });

        apply((NameChanged event)->{

            documentaryCenter.name = event.getName();

        });


    }
}
