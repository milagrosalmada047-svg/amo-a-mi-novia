function actualizarContador() {
  const inicio = new Date("2023-02-14T17:00:00");
  const ahora = new Date();

  let diff = ahora - inicio;

  let dias = Math.floor(diff / (1000 * 60 * 60 * 24));
  let horas = Math.floor(diff / (1000 * 60 * 60)) % 24;
  let minutos = Math.floor(diff / (1000 * 60)) % 60;
  let segundos = Math.floor(diff / 1000) % 60;

  document.getElementById("contador").innerHTML =
    `💛 ${dias} días ${horas}h ${minutos}m ${segundos}s`;
}

setInterval(actualizarContador, 1000);
