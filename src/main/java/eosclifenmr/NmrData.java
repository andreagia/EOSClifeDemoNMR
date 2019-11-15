package eosclifenmr;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class NmrData {
    private @Id
    @GeneratedValue
    Long id;
    // chembl id
    private String idLigand;

    // PDBe id
    private String idProtein;

   // private List<String>  csdifresidues;
    @ElementCollection
  // @CollectionTable(name="csdifresidues")
    private  List<String> csdifresidues ;

    private String kd;
    private String ph;
    private String ligconc;
    private String protconc;
    private String buffer;
    private String ionicstr;

    NmrData() {}

    NmrData(String idligand, String idProtein, List<String> csdifresidues,
            String kd, String ph, String ligconc, String protconc, String buffer, String ionicstr) {
        this.idLigand = idligand;
        this.idProtein = idProtein;
        this.csdifresidues =csdifresidues;
        this.kd = kd;
        this.ph = ph;
        this.ligconc = ligconc;
        this.protconc = protconc;
        this.buffer = buffer;
        this.ionicstr = ionicstr;
    }
    NmrData(String idligand, String idProtein, List<String> csdifresidues) {
        this.idLigand = idligand;
        this.idProtein = idProtein;
        this.csdifresidues =csdifresidues;
    }
}
