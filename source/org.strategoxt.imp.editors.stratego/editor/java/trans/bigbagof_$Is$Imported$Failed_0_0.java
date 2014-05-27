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

@SuppressWarnings("all") public class bigbagof_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported$Failed_0_0 instance = new bigbagof_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImportedFailed_0_0");
    Fail22200:
    { 
      TermReference x_4325 = new TermReference();
      TermReference y_4325 = new TermReference();
      if(y_4325.value == null)
        y_4325.value = term;
      else
        if(y_4325.value != term && !y_4325.value.match(term))
          break Fail22200;
      if(x_4325.value == null)
        x_4325.value = term;
      else
        if(x_4325.value != term && !x_4325.value.match(term))
          break Fail22200;
      Success11962:
      { 
        Fail22201:
        { 
          IStrategoTerm c_4326 = null;
          c_4326 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4326, trans.const4366, y_4325.value);
          if(term == null)
            break Fail22201;
          if(true)
            break Success11962;
        }
        term = trans.constNil3;
      }
      lifted6799 lifted67990 = new lifted6799();
      lifted67990.x_4325 = x_4325;
      lifted67990.y_4325 = y_4325;
      term = filter_1_0.instance.invoke(context, term, lifted67990);
      if(term == null)
        break Fail22200;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}