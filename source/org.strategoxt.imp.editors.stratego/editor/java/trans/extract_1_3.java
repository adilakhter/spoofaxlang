package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extract_1_3 extends Strategy 
{ 
  public static extract_1_3 instance = new extract_1_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4167, IStrategoTerm y_4166, IStrategoTerm ref_z_4166, IStrategoTerm a_4167)
  { 
    TermReference z_4166 = new TermReference(ref_z_4166);
    context.push("extract_1_3");
    Fail21271:
    { 
      IStrategoTerm b_4167 = null;
      IStrategoTerm c_4167 = null;
      IStrategoTerm h_4167 = null;
      c_4167 = term;
      term = fetch_up_position_1_1.instance.invoke(context, y_4166, e_4167, c_4167);
      if(term == null)
        break Fail21271;
      b_4167 = term;
      h_4167 = c_4167;
      term = at_last_1_0.instance.invoke(context, b_4167, lifted6447.instance);
      if(term == null)
        break Fail21271;
      term = insert_at_position_0_2.instance.invoke(context, h_4167, term, a_4167);
      if(term == null)
        break Fail21271;
      lifted6449 lifted64490 = new lifted6449();
      lifted64490.z_4166 = z_4166;
      term = at_position_1_1.instance.invoke(context, term, lifted64490, y_4166);
      if(term == null)
        break Fail21271;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}