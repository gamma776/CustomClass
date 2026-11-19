public class CampFireSite {
// this is a new campfire at a different site
//


// instance variables
private String campSiteName;
private int fireSize;
private int numWood;
private boolean isLit; 

//constructors 

public CampFireSite() {
campSiteName = "Campsite A";
fireeSize = 5;
numWood = 25;
isLit = false; 
} 
public CampFireSite(String campSiteName, int fireSize, int numWood, boolean isLit) {
 this.campSiteName = campSiteName;
 this.fireSize = fireSize;
 this.numWood = numWood;
 this.isLit = isLit;
 }
 
 // methods
 
 public void lightFire() {
 // this would set isLit to true and decrease numWood
 
 }
 public void extinguishFire() {
 //this would set isLit to false
 }
 public void biggerFire() {
 //this would increase fireSize and decrease numWood
 
 }
 public void smallerFire() {
 //this would decrease fireSize 
 
 }
 public void gatherWood() {
 //this would increase numWood by an amount
 }
 public boolean isLegal() {
 //fire safety standards require fires to be below 10. returns true if fireSize < 10
   if (fireSize >= 10)
   {
   boolean legal = false;
   } else { 
   boolean legal = true;
   }
   return legal;
  }
  
 }