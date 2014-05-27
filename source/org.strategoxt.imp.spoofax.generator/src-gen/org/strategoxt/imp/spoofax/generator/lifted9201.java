package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9201 extends Strategy 
{ 
  public static final lifted9201 instance = new lifted9201();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28850:
    { 
      IStrategoTerm term10208 = term;
      Success11384:
      { 
        Fail28851:
        { 
          IStrategoTerm term10209 = term;
          Success11385:
          { 
            Fail28852:
            { 
              term = conc_layout1_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28852;
              if(true)
                break Success11385;
            }
            term = term10209;
            IStrategoTerm term10210 = term;
            Success11386:
            { 
              Fail28853:
              { 
                term = conc_layout2_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28853;
                if(true)
                  break Success11386;
              }
              term = conc_layout3_0_0.instance.invoke(context, term10210);
              if(term == null)
                break Fail28851;
            }
          }
          if(true)
            break Success11384;
        }
        term = term10208;
        term = termFactory.makeAppl(SpoofaxGenerator._consConcLayout_1, new IStrategoTerm[]{term});
      }
      if(true)
        return term;
    }
    return null;
  }
}