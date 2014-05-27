package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class term_at_position_0_1 extends Strategy 
{ 
  public static term_at_position_0_1 instance = new term_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_92024)
  { 
    context.push("term_at_position_0_1");
    Fail75704:
    { 
      TermReference u_92024 = new TermReference();
      IStrategoTerm v_92024 = null;
      v_92024 = term;
      lifted21515 lifted215150 = new lifted21515();
      lifted215150.u_92024 = u_92024;
      term = at_position_1_1.instance.invoke(context, term, lifted215150, s_92024);
      if(term == null)
        break Fail75704;
      term = v_92024;
      if(u_92024.value == null)
        break Fail75704;
      term = u_92024.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}