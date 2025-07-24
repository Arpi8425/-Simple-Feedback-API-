package com.hdfc.feedback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

public class FeedbackServiceTest {

    @Test
    void saveFeedback_shouldCallRepoAndReturnFeedback() {

        FeedbackRepository mockRepo = mock(FeedbackRepository.class);
        FeedbackService service = new FeedbackService(mockRepo);

        Feedback input = new Feedback();
        input.setName("Arpita");
        input.setEmail("arpita@email.com");
        input.setMessage("Testing saveFeedback method");

        when(mockRepo.save(input)).thenReturn(input);


        Feedback result = service.saveFeedback(input);


        assertEquals("Arpita", result.getName());
        assertEquals("arpita@email.com", result.getEmail());
        assertEquals("Testing saveFeedback method", result.getMessage());

        verify(mockRepo).save(input);
    }
}
