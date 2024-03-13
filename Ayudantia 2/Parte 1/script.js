$(document).ready(function() {
  const users = [];

  $("#logIn").click(() => {
    const email = $("#email").val();
    const password = $("#password").val();
    for(let i = 0; i < users.length ; i++) {
      if(users[i].email === email && users[i].password === password) {
        console.log("Login Exitoso!!!!!!!");
        return;
      }
      console.log("Email o password erroneo")
    }
  })
  $("#signIn").click(() => {
    const email = $('#email').val();
		const password = $('#password').val();
    users.push({email, password});
    console.log(users)
  })
});