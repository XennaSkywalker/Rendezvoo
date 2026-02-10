//this file is only for handling the UI of the website
const meetupFormContainer = document.getElementById("meetup-form-container");
const meetupForm = document.getElementById("meetup-form");
const closeButton = document.getElementById("close-button");
const submitButton = document.getElementById("submit-button");
let latLng;

async function initMap() {
  const { Map } = await google.maps.importLibrary("maps");
  const { AdvancedMarkerElement, PinElement } =
    await google.maps.importLibrary("marker");

  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: { lat: 24, lng: 90 },
    mapId: "DEMO_MAP_ID",
  });

  map.addListener("click", (e) => {
    latLng = e.latLng;
    placeMarker(e.latLng, map);
    displayLatLng(e.latLng);
    meetupFormContainer.classList.remove("hidden");
  });

  initForm();
}

function initForm() {
  closeButton.addEventListener("click", () => {
    meetupFormContainer.classList.add("hidden");
  });

  submitButton.addEventListener("click", (e) => {
    e.preventDefault();
    const meetupFormData = new FormData(meetupForm);
    const meetupData = {
      lat: latLng.lat(),
      lng: latLng.lng(),
      meetupName: meetupFormData.get("meetup-name"),
      meetupDate: meetupFormData.get("meetup-date"),
      meetupTime: meetupFormData.get("meetup-time"),
    };
    console.log(meetupData);
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

function postMeetupRequest() {}

initMap();
