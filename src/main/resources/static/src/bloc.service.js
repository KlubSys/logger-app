class BlocService {

  load() {
    return new Promise((resolve, reject) => {
      resolve([
        { data: "AAA", size: 3 },
        { data: "BBB", size: 4 }
      ]);
    });
  }

  upload(data){
    return new Promise((resolve, reject) => {
      setTimeout(() => {resolve()}, 3000);
    });
  }

  getUploadsRequests(id){
    return new Promise((resolve, reject) => {
      resolve([
        { data: "AAA", size: 3 },
        { data: "BBB", size: 4 }
      ]);
    });
  }
}

Object.defineProperty(window, "BlocService", {
  value: new BlocService(),
  writable: false
})