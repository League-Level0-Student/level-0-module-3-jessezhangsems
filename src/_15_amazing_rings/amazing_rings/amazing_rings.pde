 int x=200;
 int y=800;
                  
void setup(){
 
  size(1000,1000);
  noFill();
  
  
}
void draw(){
  background(#FFFFFF);
  for(int i = 20;i>0;i--){
    ellipse(x+10,300,i*20,i*20);
    
  }
for(int i =20;i>0;i--){
  ellipse(y+10,300,i*20,i*20);
}
                         
  x=x+1;
  y=y-1;
  











}
