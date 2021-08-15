

var tBody;
function setup(){

  tBody = select("#java_basics tbody");

  data_javaBasics.forEach((v)=>createItem(v,tBody));

  console.log("Checking The Console For Easter Eggs? K, here ya go: https://youtu.be/T-PgodlY54g");

}

function createItem(itm,par){


  if(itm.name == str_lBr){
    createElement('tr').parent(par);
    createElement('td').parent(par).attribute("colspan","4").style("background-color","rgb(216,216,255)").style("height","2px").style("border", "1px solid darkblue");
    return;
  }


  createElement('tr').parent(par);

  createElement('td', itm.name).style("font-weight","bold").parent(par);

  createElement('td').style("text-align","center").parent(par).child(createA(itm.r1Lnk, itm.r1Src, "_blank")); 

  if (itm.r2Src === str_tbd){createElement('td', str_tbd).style("text-align","center").parent(par);}
  else{createElement('td').style("text-align","center").parent(par).child(createA(itm.r2Lnk, itm.r2Src, "_blank"));}

  if (itm.rNSrc === str_tbd){createElement('td', str_tbd).style("text-align","center").parent(par);}
  else{createElement('td').style("text-align","center").parent(par).child(createA(itm.rNLnk, itm.rNSrc, "_blank"));}
} // Ends Function createItem