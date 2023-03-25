class Router {

  constructor(menuSelector, containerSelector) {
    this.views = document.querySelectorAll(menuSelector);
    this.containers = document.querySelectorAll(containerSelector);

    this.fns = [];
  }

  init() {
    console.log("Router init");
    console.log(this.views);
    console.log(this.containers);

    this.views.forEach((item, index) => {
      item.addEventListener("click", (event) => {
        for (let pos = 0; pos < this.containers.length; pos++) {
          if (pos != index) {
            this.containers[pos].style.display = "none";
          }
        }

        this.containers[index].style.display = "block";
        this.notify({index: index});
      });
    });
  }

  subscribe(fn){
    this.fns.push(fn);
  }

  notify(data) {
    console.log(data);
    this.fns.forEach( f => f(data));
  }
}

