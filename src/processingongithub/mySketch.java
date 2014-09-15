
package processingongithub;

import toxi.geom.*;


public
        class mySketch  extends processing.core.PApplet {
    



Vec3D vec1 = new Vec3D(200, 200, 0);
Vec3D vec2 = new Vec3D(-200, 200, 0);

   public void setup(){
        size(600, 600);
}
    public void draw() {
       background(0);
      // cordinate system Perfect for working with vectors
      translate(300, 300); // defines the middle of the cordinate system
      stroke(100);
      strokeWeight((float) 0.5);
      line(-600, 0, 600, 0);
      line(0, -600, 0, 600);
      
      // vectors 1
      stroke(55, 55, 99);
      strokeWeight(2);
      point(vec1.x, vec1.y);
      line(0, 0, vec1.x, vec1.y); // 0, 0 is where we defines the origin od the system in the tanslate statement 
      
      // vec2
      stroke(255, 55, 99);
      strokeWeight(2);
      point(vec2.x, vec2.y);
      line(0, 0, vec2.x, vec2.y);
      //Vec3D newVec = vec1.copy();  //newVec.scaleSelf(0.5);
     
         // adding 1 + 2 
      Vec3D newvec = vec1.add(vec2);
       // drawing the new vec
      stroke(99, 55, 99);
      strokeWeight(2);
      point(newvec.x, newvec.y);
      line(0, 0, newvec.x, newvec.y);
      
    }
}
