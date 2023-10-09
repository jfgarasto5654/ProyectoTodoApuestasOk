<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:import url="componentesHTML/inicioHTML.jsp" />
<c:import url="componentesHTML/navBar-No-Iniciado.jsp" />

<section class="h-100 ">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
              <div id="fondoNewUsuario" class="col-xl-6 d-none d-xl-block">
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                  <div>
                      <h3 class="mb-5 text-uppercase">Sign UP</h3> 
                  </div>
                  <form action="Svusuarios" method="POST">
                             
                      <div class="form-outline mb-4">
                             <input type="text" id="form2Example11" class="form-control"
                             placeholder="User" name="usuario"/>
                             <label class="form-label" for="form2Example11">Username</label>
                             </div>

                            <div class="form-outline mb-4">
                            <input type="email" name="email" id="form2Example22" class="form-control" placeholder="email address"/>
                            <label class="form-label" for="form2Example22">EMAIL</label>
                            </div>

                            <div class="form-outline mb-4">
                            <input type="password" name="password" id="form2Example22" class="form-control" placeholder="password" />
                            <label class="form-label" for="form2Example22">Password</label>
                            </div>

                            <div class="form-outline mb-4">
                            <input type="password" name="cpassword" id="form2Example22" class="form-control" placeholder="confirm password"/>
                            <label class="form-label" for="form2Example22">Confirm password</label>
                            </div>


                            <div class="d-flex justify-content-end pt-3">
                            <button type="button" class="btn btn-light btn-lg">Reset all</button>
                            <input type="submit" name="Enviar datos" value="Enviar datos">
                            </div>                 
                  </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
    <c:import url="componentesHTML/footer.jsp" /> 
</section>
