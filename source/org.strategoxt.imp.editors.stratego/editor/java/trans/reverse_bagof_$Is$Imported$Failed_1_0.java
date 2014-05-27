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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported$Failed_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported$Failed_1_0 instance = new reverse_bagof_$Is$Imported$Failed_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4326)
  { 
    context.push("reverse_bagof_IsImportedFailed_1_0");
    Fail22203:
    { 
      TermReference n_4326 = new TermReference();
      TermReference o_4326 = new TermReference();
      if(o_4326.value == null)
        o_4326.value = term;
      else
        if(o_4326.value != term && !o_4326.value.match(term))
          break Fail22203;
      if(n_4326.value == null)
        n_4326.value = term;
      else
        if(n_4326.value != term && !n_4326.value.match(term))
          break Fail22203;
      Success11963:
      { 
        Fail22204:
        { 
          IStrategoTerm t_4326 = null;
          t_4326 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4326, trans.const4366, o_4326.value);
          if(term == null)
            break Fail22204;
          if(true)
            break Success11963;
        }
        term = trans.constNil3;
      }
      lifted6801 lifted68010 = new lifted6801();
      lifted68010.n_4326 = n_4326;
      lifted68010.o_4326 = o_4326;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68010, q_4326);
      if(term == null)
        break Fail22203;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}