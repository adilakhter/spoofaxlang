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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4720, IStrategoTerm q_4720, IStrategoTerm ref_r_4720, IStrategoTerm s_4720)
  { 
    TermReference r_4720 = new TermReference(ref_r_4720);
    context.push("extract_1_3");
    Fail22747:
    { 
      IStrategoTerm t_4720 = null;
      IStrategoTerm u_4720 = null;
      IStrategoTerm z_4720 = null;
      u_4720 = term;
      term = fetch_up_position_1_1.instance.invoke(context, q_4720, w_4720, u_4720);
      if(term == null)
        break Fail22747;
      t_4720 = term;
      z_4720 = u_4720;
      term = at_last_1_0.instance.invoke(context, t_4720, lifted6718.instance);
      if(term == null)
        break Fail22747;
      term = insert_at_position_0_2.instance.invoke(context, z_4720, term, s_4720);
      if(term == null)
        break Fail22747;
      lifted6720 lifted67200 = new lifted6720();
      lifted67200.r_4720 = r_4720;
      term = at_position_1_1.instance.invoke(context, term, lifted67200, q_4720);
      if(term == null)
        break Fail22747;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}