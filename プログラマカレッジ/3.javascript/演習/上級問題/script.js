for(var a=1; a<=5; a++){
    for(var b=1; b<=5; b++){
        document.write("★");
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

var a=1

while(a<=25){
    if(a%2==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    if(a%5==0){
        document.write("<br>");
    }
    a++;
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=5; a++){
    for(var b=1; b<=5; b++){
        if(b==a){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=5; a++){
    for(var b=1; b<=5; b++){
        if(b==a){
            document.write("☆<br>");
            break;
        }else{
            document.write("★");
        }
    }
}