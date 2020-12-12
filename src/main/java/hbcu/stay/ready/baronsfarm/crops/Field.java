package hbcu.stay.ready.baronsfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class Field {
    List<CropRow> cropRowList = new ArrayList<>();
    public List<CropRow> getCropRowList() {
        return cropRowList;
    }

    public void setCropRowList(List<CropRow> cropRowList) {
        this.cropRowList = cropRowList;
    }


}
