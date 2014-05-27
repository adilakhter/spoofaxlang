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

@SuppressWarnings("all") public class sdf2imp_options_0_0 extends Strategy 
{ 
  public static sdf2imp_options_0_0 instance = new sdf2imp_options_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("sdf2imp_options_0_0");
    Fail26711:
    { 
      IStrategoTerm term11132 = term;
      Success10901:
      { 
        Fail26712:
        { 
          term = sdf_main_module_option_1_0.instance.invoke(context, term, lifted9497.instance);
          if(term == null)
            break Fail26712;
          if(true)
            break Success10901;
        }
        term = term11132;
        IStrategoTerm term11133 = term;
        Success10902:
        { 
          Fail26713:
          { 
            term = input_file_option_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26713;
            if(true)
              break Success10902;
          }
          term = term11133;
          IStrategoTerm term11134 = term;
          Success10903:
          { 
            Fail26714:
            { 
              term = extensions_option_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26714;
              if(true)
                break Success10903;
            }
            term = term11134;
            IStrategoTerm term11135 = term;
            Success10904:
            { 
              Fail26715:
              { 
                term = parse_table_option_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26715;
                if(true)
                  break Success10904;
              }
              term = term11135;
              IStrategoTerm term11136 = term;
              Success10905:
              { 
                Fail26716:
                { 
                  term = package_name_option_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26716;
                  if(true)
                    break Success10905;
                }
                term = term11136;
                IStrategoTerm term11137 = term;
                Success10906:
                { 
                  Fail26717:
                  { 
                    term = project_name_option_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26717;
                    if(true)
                      break Success10906;
                  }
                  term = term11137;
                  IStrategoTerm term11138 = term;
                  Success10907:
                  { 
                    Fail26718:
                    { 
                      term = start_symbol_option_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26718;
                      if(true)
                        break Success10907;
                    }
                    term = term11138;
                    IStrategoTerm term11139 = term;
                    Success10908:
                    { 
                      Fail26719:
                      { 
                        term = jar_option_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail26719;
                        if(true)
                          break Success10908;
                      }
                      term = term11139;
                      IStrategoTerm term11140 = term;
                      Success10909:
                      { 
                        Fail26720:
                        { 
                          term = reset_files_option_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail26720;
                          if(true)
                            break Success10909;
                        }
                        term = term11140;
                        IStrategoTerm term11141 = term;
                        Success10910:
                        { 
                          Fail26721:
                          { 
                            term = verbose_option_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail26721;
                            if(true)
                              break Success10910;
                          }
                          term = new_project_option_0_0.instance.invoke(context, term11141);
                          if(term == null)
                            break Fail26711;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}