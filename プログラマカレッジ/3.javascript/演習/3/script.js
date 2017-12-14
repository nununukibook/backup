function S(r,π=3.14){
    return"面積は"+r*r*π+"cmです。";
}

document.write(S(5));
document.write("<br>");
document.write(S(7));
document.write("<br>");
document.write(S(10));

document.write("<br>");
document.write("<br>");

function price(l,s){
    return l*500+s*200+"です。";
}

document.write(price(2,4));
document.write("<br>");
document.write(price(1,5));
document.write("<br>");
document.write(price(3,7));