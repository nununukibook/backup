for(var a=1; a<=5; a++){
    document.write("★");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<3; a++){
    for(var b=1; b<4; b++){
        document.write("★");
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<3; a++){
    for(var b=1; b<=5; b++){
        document.write("☆");
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<5; a++){
    for(var b=1; b<6; b++){
        document.write("★");
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<5; a++){
    for(var b=1; b<4; b++){
        document.write("★");
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=3; a++){
    for(var b=1; b<=3; b++){
        if(b%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=4; a++){
    for(var b=1; b<=5; b++){
        if(b%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=5; a++){
    for(var b=1; b<=a; b++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=1; a<=5; a++){
    for(var b=1; b<=5; b++){
        document.write("★");
        if(b==a){
            document.write("<br>");
            break;
        }
    }
}