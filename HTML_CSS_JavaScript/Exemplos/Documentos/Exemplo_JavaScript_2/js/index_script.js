const botaoAzul = document.getElementById("botaoAzul");
const botaoVermelho = document.getElementById("botaoVermelho");
const botaoAmarelo = document.getElementById("botaoAmarelo");

const circulo = document.getElementById("circulo");


botaoAzul.addEventListener("click", function() {

    circulo.style.backgroundColor = "blue";

});

botaoVermelho.addEventListener("click", function() {

    circulo.style.backgroundColor = "red";

});

botaoAmarelo.addEventListener("click", function() {

    circulo.style.backgroundColor = "yellow";

});