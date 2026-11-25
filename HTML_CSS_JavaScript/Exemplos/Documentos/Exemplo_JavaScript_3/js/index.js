const botaoAzul = document.getElementById("botaoAzul");
const botaoVermelho = document.getElementById("botaoVermelho");
const botaoAmarelo = document.getElementById("botaoAmarelo");
const botaoRemoverCores = document.getElementById("botaoRemoverCores");

const circulo = document.getElementById("circulo");


botaoAzul.addEventListener("click", () => {

    circulo.textContent = "Azul";

    circulo.style.backgroundColor = "blue";
    circulo.style.color = "white";

});

botaoVermelho.addEventListener("click", () => {

    circulo.textContent = "Vermelho";

    circulo.style.backgroundColor = "red";
    circulo.style.color = "black";
    
});

botaoAmarelo.addEventListener("click", () => {

    circulo.textContent = "Amarelo";

    circulo.style.backgroundColor = "yellow";
    circulo.style.color = "black";
    
});

botaoRemoverCores.addEventListener("click", () => {

    circulo.textContent = "Preto";

    circulo.style.backgroundColor = "black";
    circulo.style.color = "white";
    
});