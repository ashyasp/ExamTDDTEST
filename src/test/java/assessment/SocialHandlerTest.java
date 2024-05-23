package assessment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SocialHandlerTest{


    @Test
    @DisplayName("To check if a social media handle was created successfully ")
    void createHandleTest() {
        SocialHandle socialHandle= new SocialHandle();
        String output = socialHandle.checkHandle("phillygeh");
        assertEquals("@phillygeh",output);

    }
    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan0CharactersTest(){

    }
    @Test // This is an example of how to test an exemption
    @DisplayName("To check if social media handle input is null")
    void checkIFNullTest() {
        SocialHandle socialHandle = new SocialHandle();
        assertThrows(NullPointerException.class, () ->
                socialHandle.checkHandle(null));

    }
    @Test
    @DisplayName("To check if social media handle is empty")
    void checkEmptyOrBlankCharactersTest() {

    }
    @Test
    @DisplayName("To check if handle was added despite multiple attempts ")
    void addHandleTest(){
    }

    @Test
    @DisplayName("To check if social medial handle removes")
    void removeHandleTest (){
        //Given
        SocialHandle socialHandle = new SocialHandle();
        //When

        //Expected

    }

}


