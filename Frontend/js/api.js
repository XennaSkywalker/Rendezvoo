export async function postMeetup(meetupData) {
  const response = await fetch("http://localhost:8080/backend/meetup", {
    headers: {
        'Content-Type': 'application/json',
    },
    method: "POST",
    body: JSON.stringify(meetupData),
  });
  console.log("Response Status:" + response.status);
  const responseText = await response.text();
  console.log("Response Body:" +  responseText);
}
