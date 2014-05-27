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

@SuppressWarnings("all") public class fetch_by_origin_1_1 extends Strategy 
{ 
  public static fetch_by_origin_1_1 instance = new fetch_by_origin_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4716, IStrategoTerm ref_l_4716)
  { 
    TermReference l_4716 = new TermReference(ref_l_4716);
    context.push("fetch_by_origin_1_1");
    Fail22716:
    { 
      IStrategoTerm m_4716 = null;
      m_4716 = term;
      term = m_4716;
      lifted6697 lifted66970 = new lifted6697();
      lifted66970.q_4716 = q_4716;
      lifted66970.l_4716 = l_4716;
      term = collect_one_1_0.instance.invoke(context, term, lifted66970);
      if(term == null)
        break Fail22716;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}