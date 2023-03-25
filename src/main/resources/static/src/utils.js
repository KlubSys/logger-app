function removeAllChildNodes(parent) {
  while (parent.firstChild) {
    parent.removeChild(parent.firstChild);
  }
}

const moneyFormatter = new Intl.NumberFormat('fr-FR', { style: 'currency', currency: 'XOF' });
function formatMoney(value) {
  return moneyFormatter.format(value);
}

function wait(second){
  return new Promise((resolve, reject) => {
    setTimeout(() => {return resolve()}, second * 1000);
  })
}

function locker(el){
  const bf = el.style.cursor;
  return {
    lock: () => {
      el.style.cursor = "wait";
    },
    unlock: () => {
      el.style.cursor = bf;
    }
  };
}