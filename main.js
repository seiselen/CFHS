

var tBody;
function setup(){

  tBody = select("#java_basics tbody");

  data_javaBasics.forEach((v)=>createItem(v,tBody));

  console.log("yolo");

}

function createItem(itm,par){
  createElement('tr').parent(par);
  createElement('td', itm.name).style("font-weight","bold").parent(par);
  createElement('td').style("text-align","center").parent(par).child(createA(itm.r1Lnk, itm.r1Src, "_blank")); 
  createElement('td').style("text-align","center").parent(par).child(createA(itm.r2Lnk, itm.r2Src, "_blank"));

  if (itm.rNSrc === str_tbd){createElement('td', str_tbd).style("text-align","center").parent(par);}
  else{createElement('td').style("text-align","center").parent(par).child(createA(itm.rNLnk, itm.rNSrc, "_blank"));}
} // Ends Function createItem