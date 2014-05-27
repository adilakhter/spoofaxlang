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

@SuppressWarnings("all") public class once_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static once_$Is$Imported$Failed_0_0 instance = new once_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImportedFailed_0_0");
    Fail23678:
    { 
      IStrategoTerm v_4879 = null;
      TermReference w_4879 = new TermReference();
      TermReference x_4879 = new TermReference();
      TermReference y_4879 = new TermReference();
      IStrategoTerm z_4879 = null;
      IStrategoTerm a_4880 = null;
      IStrategoTerm c_4880 = null;
      IStrategoTerm e_4880 = null;
      if(x_4879.value == null)
        x_4879.value = term;
      else
        if(x_4879.value != term && !x_4879.value.match(term))
          break Fail23678;
      if(w_4879.value == null)
        w_4879.value = term;
      else
        if(w_4879.value != term && !w_4879.value.match(term))
          break Fail23678;
      c_4880 = term;
      e_4880 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, e_4880, trans.const4576, x_4879.value);
      if(term == null)
        break Fail23678;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23678;
      v_4879 = term.getSubterm(0);
      a_4880 = term.getSubterm(1);
      z_4879 = term.getSubterm(2);
      term = v_4879;
      lifted7071 lifted70710 = new lifted7071();
      lifted70710.w_4879 = w_4879;
      lifted70710.x_4879 = x_4879;
      lifted70710.y_4879 = y_4879;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70710);
      if(term == null)
        break Fail23678;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23678;
      term = hashtable_put_0_2.instance.invoke(context, z_4879, a_4880, term);
      if(term == null)
        break Fail23678;
      term = c_4880;
      if(y_4879.value == null)
        break Fail23678;
      term = y_4879.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}