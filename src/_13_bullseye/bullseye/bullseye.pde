void setup() {
  size(500,500);
}
void draw() {
 for(int i = 8;i > 0;i--){
   if(i%2==0) {
     fill(#FF0303);
   }
   else if(i%2==1){
     fill(#FFFCFC);
   }
  

ellipse(250,250,i*30,i*30);

 }
}
