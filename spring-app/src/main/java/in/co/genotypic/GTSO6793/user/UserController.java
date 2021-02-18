package in.co.genotypic.GTSO6793.user;

import in.co.genotypic.GTSO6793.security.JwtUtil;
import in.co.genotypic.GTSO6793.security.SwdUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private SwdUserDetailsService swdUserDetailsService;

    @PostMapping(path = "/login")
    public ResponseEntity<?> signIn(@RequestBody LoginRequest loginRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),loginRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect Username or password", e);
        }
        final UserDetails userDetails = swdUserDetailsService.loadUserByUsername(loginRequest.getUsername());
        final String token = jwtUtil.generateToken(userDetails);
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("username", userDetails.getUsername());
        responseBody.put("token", token);
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping(path = "/signup")
    public ResponseEntity<?> signUp(@RequestBody SignupRequest signupRequest) {
        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        userRepository.save(user);
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("message", "Successfully created account");
        return ResponseEntity.ok(responseBody);
    }
}


