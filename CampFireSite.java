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
fireSize = 5;
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
 if ((fireSize > 0) && (isLit == false)) { 
 isLit = true;
 System.out.println("there was additional wood already in the pit, fire starts at " + fireSize + " units large");
 }
 if (isLit == false) {
 fireSize += 1;
 isLit = true;
 System.out.println("fire is now lit, currently at 1 unit large"); 
 numWood -= 1; 
 } else {
 System.out.println("fire is already lit"); 
 } 
 
 }
 
 public void extinguishFire() {
 //this would set isLit to false
 if (fireSize < 2) {
 isLit = false;
 System.out.println("extinguished " + campSiteName);
 } else {
 System.out.println("fire is too big to put out"); 
  }
 }
 
 public void biggerFire(int num) {
 //this would increase fireSize and decrease numWood
 if (numWood > num) {
 fireSize += num;
 numWood -= num;
 System.out.println("the fire is now " + fireSize + " units large, consumed " + num + " wood");
 System.out.println("you now have " + numWood + " pieces of wood");
 } else {
 System.out.println("you do not have enough wood to increase the fire size by that much. current wood: " + numWood);
 }
 }
 
 public void smallerFire() {
 //this would decrease fireSize 
 if (fireSize > 1) {
 fireSize -= 1;
 System.out.println("the fire is now " + fireSize + " units large");
 } else {
 System.out.println("cannot make fire any smaller, try putting it out");
  }
 }
 
 public void gatherWood() {
 //this would increase numWood by an amount
 numWood += 5;
 System.out.println("gathered 5 wood, you now have " + numWood + " pieces of wood");
 }
 
 public boolean isLegal() {
 //fire safety standards require fires to be below 10. returns true if fireSize < 10
   if (fireSize >= 10)
   {
    return false;
   } else { 
   return true;
   }
   
  }
  
  public static void main(String[] args) {
  CampFireSite cool = new CampFireSite("cool", 5, 30, true);
  System.out.println(cool.isLegal());
  
  

}
}