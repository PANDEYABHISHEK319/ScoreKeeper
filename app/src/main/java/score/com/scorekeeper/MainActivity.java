package score.com.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView MiScoreText;
    TextView DdScoreText;
    Button Mi1Run;
    Button Mi2Run;
    Button Mi4Run;
    Button Mi6Run;
    Button MiOutButton;
    Button Dd1Run;
    Button Dd2Run;
    Button Dd4Run;
    Button Dd6Run;
    Button DdOutButton;
    Button ReSet;
    int MiScore;
    int DdScore;
    int MiOut;
    int DdOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* init() for Find  all the button and textView */
        init();

        /* Set initial score for both team */
        MiScoreText.setText(MiScore + "/" + DdScore);
        DdScoreText.setText(MiScore + "/" + DdScore);

        /*Set click listener to all button */
        Mi1Run.setOnClickListener(this);
        MiOutButton.setOnClickListener(this);
        Mi2Run.setOnClickListener(this);
        Mi4Run.setOnClickListener(this);
        Mi6Run.setOnClickListener(this);
        Dd1Run.setOnClickListener(this);
        Dd2Run.setOnClickListener(this);
        Dd4Run.setOnClickListener(this);
        Dd6Run.setOnClickListener(this);
        DdOutButton.setOnClickListener(this);
        ReSet.setOnClickListener(this);
    }
    private void init() {
        // find all view via id
        Mi1Run = findViewById(R.id.mi_1);
        Mi2Run = findViewById(R.id.mi_2);
        Mi4Run = findViewById(R.id.mi_4);
        Mi6Run = findViewById(R.id.mi_6);
        MiOutButton = findViewById(R.id.mi_out);
        Dd1Run = findViewById(R.id.dd_1);
        Dd2Run = findViewById(R.id.dd_2);
        Dd4Run = findViewById(R.id.dd_4);
        Dd6Run = findViewById(R.id.dd_6);
        DdOutButton = findViewById(R.id.dd_out);
        MiScoreText = findViewById(R.id.miScore);
        DdScoreText = findViewById(R.id.ddScore);
        ReSet =findViewById(R.id.reset);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){

            case R.id.mi_1:
                /* increase one run and update score board*/
                ++MiScore;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                break;
            case R.id.mi_2:
                /* increase two run and update score board*/
                MiScore = MiScore +2;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                break;
            case R.id.mi_4:
                /* increase four run and update score board*/
                MiScore = MiScore +4;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                break;
            case R.id.mi_6:
                /* increase six run and update score board*/
                MiScore = MiScore +6;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                break;
            case R.id.mi_out:
                /* update score board with latest score and wickets */
                ++MiOut;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                break;
            case R.id.dd_1:
                /* increase one run and update score board*/
                ++DdScore;
                DdScoreText.setText(DdScore +"/"+ DdOut);
                break;
            case R.id.dd_2:
                /* increase two run and update score board*/
                DdScore = DdScore +2;
                DdScoreText.setText(DdScore +"/"+ DdOut);
                break;
            case R.id.dd_4:
                /* increase four run and update score board*/
                DdScore = DdScore +4;
                DdScoreText.setText(DdScore +"/"+ DdOut);
                break;
            case R.id.dd_6:
                /* increase six run and update score board*/
                DdScore = DdScore +6;
                DdScoreText.setText(DdScore +"/"+ DdOut);
                break;
            case R.id.dd_out:
                /* update score board with latest score and wickets */
                ++DdOut;
                DdScoreText.setText(DdScore +"/"+ DdOut);
                break;
            case R.id.reset:
                /*ReSet all button and score board  */
                MiScore =0;
                DdScore =0;
                MiOut =0;
                DdOut =0;
                MiScoreText.setText(MiScore +"/"+ MiOut);
                DdScoreText.setText(DdScore +"/"+ DdOut);
        }

    }
}
