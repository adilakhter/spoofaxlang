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

@SuppressWarnings("all") public class require_1_0 extends Strategy 
{ 
  public static require_1_0 instance = new require_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4223)
  { 
    context.push("require_1_0");
    Fail21599:
    { 
      IStrategoTerm term11692 = term;
      Success11617:
      { 
        Fail21600:
        { 
          term = f_4223.invoke(context, term);
          if(term == null)
            break Fail21600;
          { 
            if(true)
              break Fail21599;
            if(true)
              break Success11617;
          }
        }
        term = term11692;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}