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

@SuppressWarnings("all") public class bigbagof_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$No$Conflict_0_0 instance = new bigbagof_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsNoConflict_0_0");
    Fail22305:
    { 
      TermReference b_4343 = new TermReference();
      TermReference c_4343 = new TermReference();
      if(c_4343.value == null)
        c_4343.value = term;
      else
        if(c_4343.value != term && !c_4343.value.match(term))
          break Fail22305;
      if(b_4343.value == null)
        b_4343.value = term;
      else
        if(b_4343.value != term && !b_4343.value.match(term))
          break Fail22305;
      Success11990:
      { 
        Fail22306:
        { 
          IStrategoTerm g_4343 = null;
          g_4343 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4343, trans.const4427, c_4343.value);
          if(term == null)
            break Fail22306;
          if(true)
            break Success11990;
        }
        term = trans.constNil3;
      }
      lifted6836 lifted68360 = new lifted6836();
      lifted68360.b_4343 = b_4343;
      lifted68360.c_4343 = c_4343;
      term = filter_1_0.instance.invoke(context, term, lifted68360);
      if(term == null)
        break Fail22305;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}