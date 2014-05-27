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

@SuppressWarnings("all") public class bigchain_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported$Failed_0_0 instance = new bigchain_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImportedFailed_0_0");
    Fail22196:
    { 
      IStrategoTerm c_4325 = null;
      IStrategoTerm f_4325 = null;
      IStrategoTerm h_4325 = null;
      c_4325 = term;
      h_4325 = term;
      Success11960:
      { 
        Fail22197:
        { 
          IStrategoTerm j_4325 = null;
          j_4325 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4325, trans.const4366, c_4325);
          if(term == null)
            break Fail22197;
          if(true)
            break Success11960;
        }
        term = trans.constNil3;
      }
      f_4325 = term;
      term = h_4325;
      term = termFactory.makeTuple(f_4325, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6797.instance);
      if(term == null)
        break Fail22196;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}