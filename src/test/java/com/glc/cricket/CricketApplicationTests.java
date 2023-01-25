package com.glc.cricket;

import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;



// @AutoConfigureJsonTesters
@SpringBootTest
// @AutoConfigureMockMvc
class CricketApplicationTests {
	// private MockMvc mvc;
	// @Mock
	// private CricketRepository cricketRepo;
	// @InjectMocks
	// private CricketController cricketController;
	// private JacksonTester<CricketPlayer> jsonPlayer;
	// @BeforeEach
	// public void setUp(){
	// 	JacksonTester.initFields(this, new ObjectMapper());
	// 	mvc = MockMvcBuilders.standaloneSetup(cricketController).build();
	// }

	@Test
	public void add(){
		
	}
	// @Test
	// public void canGetAllPlayers(){
	// 	//Arrange
	// 	CricketPlayer cricketPlayer = new CricketPlayer(1,"Zia","Pakistan",40);
	// 	CricketPlayer cricketPlayer2 = new CricketPlayer(2,"Nabeel","Pakistan",40);
	// 	//Act
	// 	Collection<CricketPlayer> players = new LinkedList<CricketPlayer>();
	// 	players.add(cricketPlayer);
	// 	players.add(cricketPlayer2);
	// 	when(cricketRepo.viewAll()).thenReturn(players);
	// 	//Assert
	// }

}
