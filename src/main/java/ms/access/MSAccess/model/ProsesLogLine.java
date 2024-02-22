package ms.access.MSAccess.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProsesLogLine{
    private Long id;
    private String cmpnycd;
    private String rcvno;
    private String rxArrangementNumber;
    private int processLogCount;
    private String lensRlType;
    private int previousProcessNumber;
    private int previousSubprocessNumber;
    private int currentProcessNumber;
    private int currentSubprocessNumber;
    private String dipLotNumber;
    private String coatLotNumber;
    private String breakageReasonNumber;
    private String breakageResponsibleProcessNumber;
    private String processFlag1;
    private String processFlag2;
    private String processFlag3;
    private String processFlag4;
    private String processFlag5;
    private String processFlag6;
    private String processFlag7;
    private String processFlag8;
    private String processFlag9;
    private String processFlag10;
    private String processFlag11;
    private String processFlag12;
    private String processFlag13;
    private String processFlag14;
    private String processFlag15;
    private String processFlag16;
    private String additionalTreatmentType1;
    private String additionalTreatmentType2;
    private String additionalTreatmentType3;
    private String additionalTreatmentType4;
    private String additionalTreatmentType5;
    private String additionalTreatmentType6;
    private String additionalTreatmentType7;
    private String additionalTreatmentType8;
    private String additionalTreatmentType9;
    private String additionalTreatmentType10;
    private String additionalTreatmentType11;
    private String additionalTreatmentType12;
    private String additionalTreatmentType13;
    private String additionalTreatmentType14;
    private String additionalTreatmentType15;
    private String additionalTreatmentType16;
    private String additionalTreatmentType17;
    private String additionalTreatmentType18;
    private String additionalTreatmentType19;
    private String additionalTreatmentType20;
    private String materialType;
    private String materialFLensCode;
    private String materialFColorCoatCode;
    private String materialFLensName;
    private String materialFLensColor;
    private String materialFLensCoat;
    private String materialFLensCylinderType;
    private String materialFLensSphere;
    private String materialFLensCylinder;
    private String materialFLensAxis;
    private String materialFLensAddition;
    private String materialFLensDiameter;
    private String materialFOPC;
    private String materialSLensCode;
    private String materialSLensName;
    private String materialSLensColor;
    private String materialSLensMaker;
    private String materialSLensNominalBC;
    private String materialSLensDiameter;
    private String materialSLensThicknessType;
    private String materialSLensAddition;
    private String materialSOPC;
    private String materialRLensCode;
    private String materialRColorCoatCode;
    private String materialRLensName;
    private String materialRLensColor;
    private String materialRLensCoat;
    private String materialRLensCylinderType;
    private String materialRLensSphere;
    private String materialRLensCylinder;
    private String materialRLensAxis;
    private String materialRLensAddition;
    private String materialRLensDiameter;
    private LocalDateTime amddate;

    public ProsesLogLine(String cmpnycd, String rcvno, String rxArrangementNumber, int processLogCount, String lensRlType, int previousProcessNumber, int previousSubprocessNumber, int currentProcessNumber, int currentSubprocessNumber, String dipLotNumber, String coatLotNumber, String breakageReasonNumber, String breakageResponsibleProcessNumber, String processFlag1, String processFlag2, String processFlag3, String processFlag4, String processFlag5, String processFlag6, String processFlag7, String processFlag8, String processFlag9, String processFlag10, String processFlag11, String processFlag12, String processFlag13, String processFlag14, String processFlag15, String processFlag16, String additionalTreatmentType1, String additionalTreatmentType2, String additionalTreatmentType3, String additionalTreatmentType4, String additionalTreatmentType5, String additionalTreatmentType6, String additionalTreatmentType7, String additionalTreatmentType8, String additionalTreatmentType9, String additionalTreatmentType10, String additionalTreatmentType11, String additionalTreatmentType12, String additionalTreatmentType13, String additionalTreatmentType14, String additionalTreatmentType15, String additionalTreatmentType16, String additionalTreatmentType17, String additionalTreatmentType18, String additionalTreatmentType19, String additionalTreatmentType20, String materialType, String materialFLensCode, String materialFColorCoatCode, String materialFLensName, String materialFLensColor, String materialFLensCoat, String materialFLensCylinderType, String materialFLensSphere, String materialFLensCylinder, String materialFLensAxis, String materialFLensAddition, String materialFLensDiameter, String materialFOPC, String materialSLensCode, String materialSLensName, String materialSLensColor, String materialSLensMaker, String materialSLensNominalBC, String materialSLensDiameter, String materialSLensThicknessType, String materialSLensAddition, String materialSOPC, String materialRLensCode, String materialRColorCoatCode, String materialRLensName, String materialRLensColor, String materialRLensCoat, String materialRLensCylinderType, String materialRLensSphere, String materialRLensCylinder, String materialRLensAxis, String materialRLensAddition, String materialRLensDiameter, LocalDateTime amddate) {
        this.cmpnycd = cmpnycd;
        this.rcvno = rcvno;
        this.rxArrangementNumber = rxArrangementNumber;
        this.processLogCount = processLogCount;
        this.lensRlType = lensRlType;
        this.previousProcessNumber = previousProcessNumber;
        this.previousSubprocessNumber = previousSubprocessNumber;
        this.currentProcessNumber = currentProcessNumber;
        this.currentSubprocessNumber = currentSubprocessNumber;
        this.dipLotNumber = dipLotNumber;
        this.coatLotNumber = coatLotNumber;
        this.breakageReasonNumber = breakageReasonNumber;
        this.breakageResponsibleProcessNumber = breakageResponsibleProcessNumber;
        this.processFlag1 = processFlag1;
        this.processFlag2 = processFlag2;
        this.processFlag3 = processFlag3;
        this.processFlag4 = processFlag4;
        this.processFlag5 = processFlag5;
        this.processFlag6 = processFlag6;
        this.processFlag7 = processFlag7;
        this.processFlag8 = processFlag8;
        this.processFlag9 = processFlag9;
        this.processFlag10 = processFlag10;
        this.processFlag11 = processFlag11;
        this.processFlag12 = processFlag12;
        this.processFlag13 = processFlag13;
        this.processFlag14 = processFlag14;
        this.processFlag15 = processFlag15;
        this.processFlag16 = processFlag16;
        this.additionalTreatmentType1 = additionalTreatmentType1;
        this.additionalTreatmentType2 = additionalTreatmentType2;
        this.additionalTreatmentType3 = additionalTreatmentType3;
        this.additionalTreatmentType4 = additionalTreatmentType4;
        this.additionalTreatmentType5 = additionalTreatmentType5;
        this.additionalTreatmentType6 = additionalTreatmentType6;
        this.additionalTreatmentType7 = additionalTreatmentType7;
        this.additionalTreatmentType8 = additionalTreatmentType8;
        this.additionalTreatmentType9 = additionalTreatmentType9;
        this.additionalTreatmentType10 = additionalTreatmentType10;
        this.additionalTreatmentType11 = additionalTreatmentType11;
        this.additionalTreatmentType12 = additionalTreatmentType12;
        this.additionalTreatmentType13 = additionalTreatmentType13;
        this.additionalTreatmentType14 = additionalTreatmentType14;
        this.additionalTreatmentType15 = additionalTreatmentType15;
        this.additionalTreatmentType16 = additionalTreatmentType16;
        this.additionalTreatmentType17 = additionalTreatmentType17;
        this.additionalTreatmentType18 = additionalTreatmentType18;
        this.additionalTreatmentType19 = additionalTreatmentType19;
        this.additionalTreatmentType20 = additionalTreatmentType20;
        this.materialType = materialType;
        this.materialFLensCode = materialFLensCode;
        this.materialFColorCoatCode = materialFColorCoatCode;
        this.materialFLensName = materialFLensName;
        this.materialFLensColor = materialFLensColor;
        this.materialFLensCoat = materialFLensCoat;
        this.materialFLensCylinderType = materialFLensCylinderType;
        this.materialFLensSphere = materialFLensSphere;
        this.materialFLensCylinder = materialFLensCylinder;
        this.materialFLensAxis = materialFLensAxis;
        this.materialFLensAddition = materialFLensAddition;
        this.materialFLensDiameter = materialFLensDiameter;
        this.materialFOPC = materialFOPC;
        this.materialSLensCode = materialSLensCode;
        this.materialSLensName = materialSLensName;
        this.materialSLensColor = materialSLensColor;
        this.materialSLensMaker = materialSLensMaker;
        this.materialSLensNominalBC = materialSLensNominalBC;
        this.materialSLensDiameter = materialSLensDiameter;
        this.materialSLensThicknessType = materialSLensThicknessType;
        this.materialSLensAddition = materialSLensAddition;
        this.materialSOPC = materialSOPC;
        this.materialRLensCode = materialRLensCode;
        this.materialRColorCoatCode = materialRColorCoatCode;
        this.materialRLensName = materialRLensName;
        this.materialRLensColor = materialRLensColor;
        this.materialRLensCoat = materialRLensCoat;
        this.materialRLensCylinderType = materialRLensCylinderType;
        this.materialRLensSphere = materialRLensSphere;
        this.materialRLensCylinder = materialRLensCylinder;
        this.materialRLensAxis = materialRLensAxis;
        this.materialRLensAddition = materialRLensAddition;
        this.materialRLensDiameter = materialRLensDiameter;
        this.amddate = amddate;
    }
}