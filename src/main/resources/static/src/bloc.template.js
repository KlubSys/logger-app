const BLOC_TEMPLATE = `
<div class="text-center">
  <img class="me-3" src="assets/img/cube.png" alt="" width="50">
    <p class="mt-1 text-small text-muted text-center">@id</p>
</div>
`;

function renderBloc(id){
  return BLOC_TEMPLATE.replace("@id", id);
}
