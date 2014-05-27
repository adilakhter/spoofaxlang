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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail21970:
    { 
      IStrategoTerm u_4286 = null;
      TermReference v_4286 = new TermReference();
      TermReference w_4286 = new TermReference();
      TermReference x_4286 = new TermReference();
      IStrategoTerm y_4286 = null;
      IStrategoTerm z_4286 = null;
      IStrategoTerm b_4287 = null;
      IStrategoTerm d_4287 = null;
      if(w_4286.value == null)
        w_4286.value = term;
      else
        if(w_4286.value != term && !w_4286.value.match(term))
          break Fail21970;
      if(v_4286.value == null)
        v_4286.value = term;
      else
        if(v_4286.value != term && !v_4286.value.match(term))
          break Fail21970;
      b_4287 = term;
      d_4287 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, d_4287, trans.const4327, w_4286.value);
      if(term == null)
        break Fail21970;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21970;
      u_4286 = term.getSubterm(0);
      z_4286 = term.getSubterm(1);
      y_4286 = term.getSubterm(2);
      term = u_4286;
      lifted6719 lifted67190 = new lifted6719();
      lifted67190.v_4286 = v_4286;
      lifted67190.w_4286 = w_4286;
      lifted67190.x_4286 = x_4286;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67190);
      if(term == null)
        break Fail21970;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21970;
      term = hashtable_put_0_2.instance.invoke(context, y_4286, z_4286, term);
      if(term == null)
        break Fail21970;
      term = b_4287;
      if(x_4286.value == null)
        break Fail21970;
      term = x_4286.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}