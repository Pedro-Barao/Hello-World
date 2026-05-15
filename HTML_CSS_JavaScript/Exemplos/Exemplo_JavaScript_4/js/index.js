const pequeno = document.getElementById("pequeno");
const medio = document.getElementById("medio");
const grande = document.getElementById("grande");
const gigante = document.getElementById("gigante");

const timesNewRoman = document.getElementById("timesNewRoman");
const arial = document.getElementById("arial");
const lucidaSans = document.getElementById("lucidaSans");
const courierNew = document.getElementById("courierNew");

const fontePreta = document.getElementById("fontePreta");
const fonteBranca = document.getElementById("fonteBranca");
const fonteCinza = document.getElementById("fonteCinza");
const fonteAmarela = document.getElementById("fonteAmarela");

const fundoPreto = document.getElementById("fundoPreto");
const fundoBranco = document.getElementById("fundoBranco");
const fundoCinza = document.getElementById("fundoCinza");
const fundoAmarelo = document.getElementById("fundoAmarelo");


function mudarTamanhoFonte(tamanho) {

    const texto = document.getElementById("texto");

    if(tamanho == 10)
    {

        texto.style.height = "50px";
        pequeno.addEventListener("click", texto.style.fontSize = "10px");

    }

    else if(tamanho == 15)
    {

        texto.style.height = "70px";
        medio.addEventListener("click", texto.style.fontSize = "15px");

    }
    
    else if(tamanho == 20)
    {

        texto.style.height = "120px";
        grande.addEventListener("click", texto.style.fontSize = "20px");

    }

    else
    {

        texto.style.height = "180px";
        gigante.addEventListener("click", texto.style.fontSize = "25px");

    }

}


function mudarTipoFonte(tipo) {

    const texto = document.getElementById("texto");

    if(tipo == "times new roman")
    {

        timesNewRoman.addEventListener("click", texto.style.fontFamily = "'Times New Roman', Times, serif");

    }

    else if(tipo == "arial")
    {

        arial.addEventListener("click", texto.style.fontFamily = "Arial, Helvetica, sans-serif");

    }

    else if(tipo == "lucida sans")
    {

        lucidaSans.addEventListener("click", texto.style.fontFamily = "'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif");

    }

    else
    {

        courierNew.addEventListener("click", texto.style.fontFamily = "'Courier New', Courier, monospace");

    }

}


function mudarCorFonte(corFonte) {

    const texto = document.getElementById("texto");

    if(corFonte == "preta")
    {

        fontePreta.addEventListener("click", texto.style.color = "rgb(30, 30, 30)");

    }

    else if(corFonte == "branca")
    {

        fonteBranca.addEventListener("click", texto.style.color = "rgb(225, 225, 225)");

    }

    else if(corFonte == "cinza")
    {

        fonteCinza.addEventListener("click", texto.style.color = "rgb(140, 140, 140)");

    }

    else 
    {

        fonteAmarela.addEventListener("click", texto.style.color = "rgb(255, 240, 100)")

    }

}


function mudarCorFundo(corFundo) {

    const texto = document.getElementById("texto");

    if(corFundo == "preto")
    {

        fundoPreto.addEventListener("click", texto.style.backgroundColor = "rgb(0, 0, 0)");

    }

    else if(corFundo == "branco")
    {

        fundoBranco.addEventListener("click", texto.style.backgroundColor = "rgb(255, 255, 255)");

    }

    else if(corFundo == "cinza")
    {

        fundoCinza.addEventListener("click", texto.style.backgroundColor = "rgb(100, 100, 100)");

    }

    else 
    {

        fundoAmarelo.addEventListener("click", texto.style.backgroundColor = "rgb(205, 190, 50)");

    }

}