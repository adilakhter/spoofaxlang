package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail22995:
    { 
      IStrategoTerm u_4640 = null;
      TermReference v_4640 = new TermReference();
      TermReference w_4640 = new TermReference();
      IStrategoTerm x_4640 = null;
      IStrategoTerm y_4640 = null;
      IStrategoTerm a_4641 = null;
      IStrategoTerm b_4641 = null;
      IStrategoTerm d_4641 = null;
      IStrategoTerm e_4641 = null;
      if(v_4640.value == null)
        v_4640.value = term;
      else
        if(v_4640.value != term && !v_4640.value.match(term))
          break Fail22995;
      a_4641 = term;
      d_4641 = term;
      b_4641 = trans.const4485;
      e_4641 = d_4641;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, e_4641, b_4641, trans.constCons2047);
      if(term == null)
        break Fail22995;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22995;
      u_4640 = term.getSubterm(0);
      y_4640 = term.getSubterm(1);
      x_4640 = term.getSubterm(2);
      term = u_4640;
      lifted6899 lifted68990 = new lifted6899();
      lifted68990.v_4640 = v_4640;
      lifted68990.w_4640 = w_4640;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68990);
      if(term == null)
        break Fail22995;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22995;
      term = hashtable_put_0_2.instance.invoke(context, x_4640, y_4640, term);
      if(term == null)
        break Fail22995;
      term = a_4641;
      if(w_4640.value == null)
        break Fail22995;
      term = w_4640.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}