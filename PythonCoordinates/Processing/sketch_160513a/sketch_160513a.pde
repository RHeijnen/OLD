PImage bg;  
JSONArray json;

void setup() {
  size(750,600); // size of canvas
  bg = loadImage("iceland.png"); // loads the background image iceland png
  bg.resize(750, 600); // resizes the background to fir the canvas
  // the size is picked based on it seeming a good fit for the scale
  json = loadJSONArray("prototype.json");  // loads the ijsland json file
  //noLoop();

  
}

void draw() {
  background(bg);
  for (int i = 0; i < json.size(); i++) {
    
    JSONObject iceland = json.getJSONObject(i); 
    
    String timestamp = iceland.getString("timestamp");
    float latitude = iceland.getFloat("latitude");
    float longitude = iceland.getFloat("longitude");
    double depth = iceland.getInt("depth");
    double size = iceland.getInt("size");
    double quality = iceland.getInt("quality");
    // map
    // https://en.wikipedia.org/wiki/Template:Location_map_Iceland
    //
    // print mouse x, y
    //println(mouseY);
    
    float maptestlat = map(latitude, 66, 64, 185, 450);
    float maptestlon = map(longitude, -24, -14, 86, 644);    
    // Bovenstaande map conversies zijn NU goed
    // IF/SWITCH STATEMENT HIER
    //
    // size variable
    int graph_size = 0;
    
    if(size == 0.0){
    graph_size = 10;
    }else if(size <= 1.0) {
    graph_size = 15;
    }else if(size <=  2.0) {
    graph_size = 21;
    }else if(size <=  3.0) {
    graph_size = 28;
    }else if(size <=  4.0) {
    graph_size = 33;
    }
    
    if (depth < 3.0) {
      fill(255,0,0,155);
    }else if(depth < 5.0) {
      fill(0,0,255,155);
    }else if(depth < 7.0) {
      fill(0,255,0,155);
    }else if(depth < 9.0) {
      fill(255,255,0,155);
    }else if(depth < 12.0) {
      fill(0,128,128,155);
    }
    ellipse(maptestlon,maptestlat, graph_size, graph_size);

  }
  
  
  
  // legenda main
  fill(255, 255, 255);//set the rect color to white
  rect(10, 10, width-25, 75);
  fill(0);//set the text color to black
  textSize(16);
  text("Iceland Earthquake Chart - 5/13/2016 6:33:10 ", 20, 30);

  // legenda item 3 - color 1 - depth < 3
  fill(255,0,0,155);
  ellipse(25,55, 15, 15);
  fill(0);//set the text color to black
  text("Depth < 3", 35, 60);
  
  // legenda item 4 - color 1 - depth < 5
  fill(0,0,255,155);
  ellipse(25,73, 15, 15);
  fill(0);//set the text color to black
  text("Depth < 5", 35, 80);
  
  // legenda item 5 - color 1 - depth < 7
  fill(0,255,0,155);
  ellipse(125,55, 15, 15);
  fill(0);//set the text color to black
  text("Depth < 7", 135, 60);
  
  // legenda item 6 - color 1 - depth < 9
  fill(255,255,0,155);
  ellipse(125,73, 15, 15);
  fill(0);//set the text color to black
  text("Depth < 9", 135, 80);
  
  // legenda item 6 - color 1 - depth < 12
  fill(0,128,128,155);
  ellipse(225,55, 15, 15);
  fill(0);//set the text color to black
  text("Depth < 12", 235, 60);
  
  
  //
  // size 1
  fill(0,0,0,155);
  ellipse(350,52, 10, 10);
  textSize(12);
  fill(0);//set the text color to black
  text("Size 1", 360, 56);
 
  // size 2
  fill(0,0,0,155);
  ellipse(420,52, 15, 15);
  textSize(12);
  fill(0);//set the text color to black
  text("Size 2", 430, 56);
  
  
  //  size 3
  fill(0,0,0,155);
  ellipse(480,52, 21, 21);
  textSize(12);
  fill(0);//set the text color to black
  text("Size 3", 500, 56);
  
    //  size 4
  fill(0,0,0,155);
  ellipse(555,52, 28, 28);
  textSize(12);
  fill(0);//set the text color to black
  text("Size 4", 580, 56);
  
      //  size 5
  fill(0,0,0,155);
  ellipse(640,52, 33, 33);
  textSize(12);
  fill(0);//set the text color to black
  text("Size 5", 675, 56);
  
}