package testBase;

public class BuildingDesignAreaPath {
	
	static String BDAreaPath;
	static String ServicaseAreaPath;
	
	public String getAreaPath(String ap) {
		ServicaseAreaPath=ap;
		
		if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\AECOsim Energy Simulator (1893)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\Energy Simulator";
		
		else if (ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Bentley Architecture (1407)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\Architectural Design";
		
		else if (ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Bentley Building Mechanical Systems (1173)")) 
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\HVAC Design";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Bentley Facilities Space Planner (1264)"))
		BDAreaPath="Facilities Engineering\\Building Design\\Bentley Facilities Space Planner (1264)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Bentley Speedikon Architectural (1495)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Speedikon (2831)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Bentley Speedikon Industrial (1493)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Speedikon (2831)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Facilities iTwin Transformation Chain Architecture (3394)"))
		BDAreaPath="Facilities Engineering\\Building Design\\iModel Bridge for OpenBuildings (2906)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\FactorySight (3142)"))
		BDAreaPath="Facilities Engineering\\FactorySight";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\iModel Connector for OpenBuildings (2906)"))
		BDAreaPath="Facilities Engineering\\Building Design\\iModel Bridge for OpenBuildings (2906)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\LEGION Social Distancing Promotion (6211)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\Pedestrian Modeling";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Open Designer Suite Practitioner License (6199)") )
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Designer (1934)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Designer Practitioner License (6309)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings GenerativeComponents (1713)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings GenerativeComponents (1713)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings GenerativeComponents Extension (1582)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings GenerativeComponents Extension (1582)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Speedikon (2831)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Speedikon (2831)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Speedikon Practitioner License (6219)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Speedikon (2831)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Station Designer (2848)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Station Designer (2848)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings Station Designer Practitioner License (6215)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Station Designer (2848)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\OpenBuildings TRICAD Concept Tool (2944)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\PowerStructural Modeler (1846)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\Structural Design";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Building Design\\OpenBuildings\\Structural Modeler (1148)"))
		BDAreaPath="Facilities Engineering\\Building Design\\OpenBuildings Designer (1934)\\Structural Design";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoCAD Based Plant Design License (6090)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT Equipment (1060)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT Isometrics (1064)"))
		BDAreaPath="Facilities Engineering\\AutoPLANT Isometrics (1064)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT Modeler (2293)"))
		BDAreaPath="Facilities Engineering\\AutoPLANT Modeler (2293)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT Object Enablers for AutoCAD (2701)"))
		BDAreaPath="Facilities Engineering\\AutoPLANT Object Enablers for AutoCAD (2701)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT PID (1066)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\AutoPLANT Raceways (1072)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\Bentley Data Manager (1078)"))
		BDAreaPath="Facilities Engineering\\Bentley Data Manager (1078)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\Bentley PlantWAVE for PDMx (1773)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\Bentley PlantWAVE for PDS (1772)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\Bentley Vision (1101)"))
		BDAreaPath="Facilities Engineering\\Bentley Vision (1101)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\iModel Connector for AutoPLANT (2825)"))
		BDAreaPath="Facilities Engineering\\iModel Bridge for AutoPLANT (2825)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\Plant Project Tools (2367)"))
		BDAreaPath="Facilities Engineering\\Plant Project Tools (2367)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AutoPLANT\\PlantWAVE for PlantSpace (1866)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AXSYS\\AXSYS i-model Engine (1896)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AXSYS\\Bentley AXSYS.Engine (1360)"))
		BDAreaPath="Facilities Engineering\\Bentley AXSYS.Engine (1360)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\AXSYS\\Bentley AXSYS.Process (1362)"))
		BDAreaPath="Facilities Engineering\\Bentley AXSYS.Process (1362)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\Bentley Raceway and Cable Management (1887)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\COMOS EI and C (2668)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\COMOS Feed Bundle (2666)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\COMOS P and ID Bundle (2667)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\COMOS Platform (2669)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\GOST Standards Content (1974)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\KKS Workspace (1981)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Data Extensibility App (3122)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Data Import Backend (3089)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Engineering Data App (3090)"))
		BDAreaPath="Facilities Engineering\\Bentley Engineering Data Manager (3090)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant for China (3338)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Isometrics Manager (1828)"))
		BDAreaPath="Facilities Engineering\\Bentley OpenPlant Isometrics Manager (1828)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Modeler (1830)"))
		BDAreaPath="Facilities Engineering\\Bentley OpenPlant Modeler (1830)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Modeler Practitioner License (6241)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant ModelServer (1829)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Orthographics Manager (2309)"))
		BDAreaPath="Facilities Engineering\\OpenPlant Orthographics Manager (2309)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant PID (1786)"))
		BDAreaPath="Facilities Engineering\\Bentley OpenPlant PowerPID (1786)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant PID Practitioner License (6288)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Project Administrator (2405)"))
		BDAreaPath="Facilities Engineering\\Bentley OpenPlant Project Administrator (2405)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Solution License (6091)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Starter Kit License (6089)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Support Engineering (2190)"))
		BDAreaPath="Facilities Engineering\\OpenPlant Support Engineering (2190)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\OpenPlant Support Engineering Practitioner License (6419)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\PIP Workspace for OpenPlant PID (2330)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\Plant Configuration Provider (2981)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\Plant Exporter (2407)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\PlantSight for OpenPlant (3144)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\ProjectWise PDx Dynamic Review Service (1807)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\OpenPlant\\Schneider Raceway for BRCM (2348)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\PlantSpace"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Plant Design\\PlantSpace\\Bentley PlantSpace Isometrics (1131)"))
		BDAreaPath="Facilities Engineering\\Bentley OpenPlant Isometrics Manager (1828)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\Bentley Rebar (1157)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\Bentley Rebar (1157)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\iModel Connector for ProStructures (3214)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProConcrete (1787)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProConcrete (1787)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProConcrete for AutoCAD (2456)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProConcrete AutoCAD (2456)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProSteel (2269)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProSteel (2269)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProSteel 3D Modeler (1720)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProSteel for AutoCAD (1721)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProSteel 3D Professional (1721)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProSteel for AutoCAD Practitioner License (6252)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProStructures (2270)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProStructures (2270)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProStructures for AutoCAD (2455)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\ProStructures for AutoCAD (2455)";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\ProStructures Practitioner License (6251)"))
		BDAreaPath="";
		
		else if(ServicaseAreaPath.equalsIgnoreCase("ProductAdvancement\\Engineering Applications\\Structural Detailing\\ProStructures\\Structural Modeling Components (2441)"))
		BDAreaPath="Facilities Engineering\\Structural Detailing\\Structural Modeling Components (2441)";
		

		return BDAreaPath;

	}


}
