async function initMap() {
  // Request needed libraries.
  const { Map } = await google.maps.importLibrary("maps");
  const { AdvancedMarkerElement, PinElement } =
    await google.maps.importLibrary("marker");

  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: { lat: 24, lng: 90 },
    mapId: "DEMO_MAP_ID",
  });

  const meetupFormContainer = document.getElementById("meetup-form-container");
  const closeButton = document.getElementById("close-button");

  map.addListener("click", (e) => {
    placeMarker(e.latLng, map);
    displayLatLng(e.latLng);
    meetupFormContainer.classList.remove("hidden");
  });

  closeButton.addEventListener("click", () => {
    meetupFormContainer.classList.add("hidden");
  });
}

//helper functions
function placeMarker(latLng, map) {
  new google.maps.marker.AdvancedMarkerElement({
    position: latLng,
    map: map,
  });
}

function displayLatLng(latLng) {
  console.log(JSON.stringify(latLng));
}

initMap();
