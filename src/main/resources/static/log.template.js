const LOG_TEMPLATE = `
<div class="d-flex mb-4 log" data-id="@id">
  <div>
    <div class="bg-purple" style="width: 30px; height: 30px; border-radius: 50%;position: relative; left: -32px;"></div>
  </div>

  <div class="ps-3 pe-2 card border-light" style="width: 500px; max-width: 500px; word-wrap: break-work">
    <div>@time</div>
    <div>
      <span class="log-title">@title</span>
    </div>
    <div>
      <div class="row">
      <p>@content</p>
      </div>
    
    </div>
  </div>
</div>
`;

function renderLog(id, time, title, content) {
  return LOG_TEMPLATE.replace("@id", id)
    .replace("@time", time)
    .replace("@title", title)
    .replace("@content", content);
}
