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

@SuppressWarnings("all") public class undefine_$No$Analysis_0_1 extends Strategy 
{ 
  public static undefine_$No$Analysis_0_1 instance = new undefine_$No$Analysis_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4301)
  { 
    Fail22056:
    { 
      if(true)
        break Fail22056;
      if(true)
        return term;
    }
    context.push("undefine_NoAnalysis_0_1");
    context.popOnFailure();
    return null;
  }
}